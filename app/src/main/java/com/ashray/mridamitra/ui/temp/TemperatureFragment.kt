package com.ashray.mridamitra.ui.temp

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ashray.mridamitra.R
import com.ashray.mridamitra.databinding.FragmentHomeBinding
import com.ashray.mridamitra.databinding.FragmentTemperatureBinding
import com.ashray.mridamitra.ui.home.HomeViewModel

class TemperatureFragment : Fragment() {
    private var _binding: FragmentTemperatureBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    companion object {
        fun newInstance() = TemperatureFragment()
    }

    private lateinit var viewModel: TemperatureViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tempViewModel =
            ViewModelProvider(this).get(TemperatureViewModel::class.java)

        _binding = FragmentTemperatureBinding.inflate(inflater, container, false)
        val tv:TextView=binding.tempText
        tv.setText("temp fragment")
        return inflater.inflate(R.layout.fragment_temperature, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TemperatureViewModel::class.java)
        // TODO: Use the ViewModel
    }

}