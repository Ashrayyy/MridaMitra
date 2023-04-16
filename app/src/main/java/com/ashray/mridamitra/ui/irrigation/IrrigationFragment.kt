package com.ashray.mridamitra.ui.irrigation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ashray.mridamitra.R

class IrrigationFragment : Fragment() {

    companion object {
        fun newInstance() = IrrigationFragment()
    }

    private lateinit var viewModel: IrrigationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_irrigation, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(IrrigationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}