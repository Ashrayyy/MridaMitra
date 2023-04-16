package com.ashray.mridamitra.ui.humidity

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ashray.mridamitra.R
import com.ashray.mridamitra.databinding.FragmentHomeBinding
import com.ashray.mridamitra.databinding.FragmentHumidityBinding
import com.ashray.mridamitra.ui.home.HomeViewModel

class HumidityFragment : Fragment() {
    private var _binding: FragmentHumidityBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    companion object {
        fun newInstance() = HumidityFragment()
    }

    private lateinit var viewModel: HumidityViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val homeViewModel =
            ViewModelProvider(this).get(HumidityViewModel::class.java)

        _binding = FragmentHumidityBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HumidityViewModel::class.java)
        // TODO: Use the ViewModel
    }

}