package com.jenergy.solar.navigationcomponent.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jenergy.solar.navigationcomponent.R
import com.jenergy.solar.navigationcomponent.SendCashFragmentDirections
import com.jenergy.solar.navigationcomponent.databinding.FragmentCashSendBinding
import com.jenergy.solar.navigationcomponent.databinding.FragmentSettingBinding
import com.jenergy.solar.navigationcomponent.utils.SampleData


class SettingFragment : Fragment() {
    private lateinit var binding:FragmentSettingBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentSettingBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //val navController = findNavController()

        val data:Long = SampleData.defaultAmount.value!!
        binding.etAmount.setText(data.toString())

        binding.saveBtn.setOnClickListener {
            val defaultValue = binding.etAmount.text.toString().toLong()
            SampleData.defaultAmount.value = defaultValue
        }
    }


}