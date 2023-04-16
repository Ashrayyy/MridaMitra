package com.ashray.mridamitra.ui.moisture

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ashray.mridamitra.R
import com.ashray.mridamitra.databinding.FragmentMositureBinding
import com.ashray.mridamitra.databinding.FragmentSlideshowBinding
import com.ashray.mridamitra.ui.slideshow.SlideshowViewModel

class MositureFragment : Fragment() {

    private var _binding: FragmentMositureBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = MositureFragment()
    }

    private lateinit var viewModel: MositureViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val moistureViewModel =
            ViewModelProvider(this).get(MositureViewModel::class.java)

        _binding = FragmentMositureBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textSlideshow
//        slideshowViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MositureViewModel::class.java)
        // TODO: Use the ViewModel
    }

}