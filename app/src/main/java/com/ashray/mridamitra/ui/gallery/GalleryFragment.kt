package com.ashray.mridamitra.ui.gallery

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ashray.mridamitra.databinding.FragmentGalleryBinding
import com.ashray.mridamitra.model.Feed
import com.ashray.mridamitra.model.Values
import com.ashray.mridamitra.services.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    private val myService = Retrofit.Builder()
        .baseUrl("https://api.thingspeak.com/channels/2054475/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiService::class.java)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root
        loadData()
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun loadData() {
        myService.getPosts().enqueue(object: Callback<Values> {
            override fun onResponse(call: Call<Values>, response: Response<Values>) {
                if (response.isSuccessful) {
                    val data = response.body()
                    if(data!=null){
                        Log.d("main",data.feeds[0].field1)
                        binding.t1.text = data.feeds[0].field2
                        binding.t2.text = data.feeds[1].field2
                        binding.t3.text = data.feeds[2].field2
                        binding.t4.text = data.feeds[3].field2
                        binding.t5.text = data.feeds[4].field2

                        binding.d1.text = data.feeds[0].created_at
                        binding.d2.text = data.feeds[1].created_at
                        binding.d3.text = data.feeds[2].created_at
                        binding.d4.text = data.feeds[3].created_at
                        binding.d5.text = data.feeds[4].created_at
//                        adapter = MyAdapter(requireContext(),data.MovieList)
//                        recyclerView = binding.rv
//                        recyclerView.adapter = adapter
//                        recyclerView.layoutManager = LinearLayoutManager(requireContext())

                    }
                    //adapter code
                } else {
                    Log.d("main","fail1")
                    Toast.makeText(activity, "Failed to load data1", Toast.LENGTH_SHORT).show()

                }

            }
            override fun onFailure(call: Call<Values>, t: Throwable) {
                Log.d("main",t.message.toString())
                Toast.makeText(activity, "Failed to load data", Toast.LENGTH_SHORT).show()


            }
        })
    }
}