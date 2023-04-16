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
import org.tensorflow.lite.Interpreter

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
//
//        // Load the TFLite model from the asset file
//
//        val tflite = Interpreter(loadModelFile("Irrigation_model.tflite"))
//        Interpreter.Options
//// Prepare your input data
//        val input = prepareInputData()
//
//// Run inference
//        val output = Array(1) { FloatArray(10) }
//        tflite.run(input, output)
//
//// Process the output
//        processOutputData(output)
//
//        // Helper functions
//        private fun loadModelFile(filename: String): MappedByteBuffer {
//            val assetFileDescriptor = assets.openFd(filename)
//            val inputStream = FileInputStream(assetFileDescriptor.fileDescriptor)
//            val fileChannel = inputStream.channel
//            val startOffset = assetFileDescriptor.startOffset
//            val declaredLength = assetFileDescriptor.declaredLength
//            return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, declaredLength)
//        }
//
//        private fun prepareInputData(): Array<FloatArray> {
//            // TODO: Implement input data preparation
//        }
//
//        private fun processOutputData(output: Array<FloatArray>) {
//            // TODO: Implement output data processing
//        }


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