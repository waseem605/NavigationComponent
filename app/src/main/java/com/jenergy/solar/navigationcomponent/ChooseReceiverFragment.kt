package com.jenergy.solar.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jenergy.solar.navigationcomponent.databinding.FragmentHomeBinding
import com.jenergy.solar.navigationcomponent.databinding.FragmentReceiverChooseBinding


class ChooseReceiverFragment : Fragment() {
    lateinit var binding: FragmentReceiverChooseBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentReceiverChooseBinding.inflate(layoutInflater,container,false)

        // return inflater.inflate(R.layout.fragment_home, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextBtn.setOnClickListener {
            val receiverName = binding.etEnterName.text.trim().toString()
/*
            val  args = Bundle()
            args.putString("receiverName",receiverName)*/
            val action = ChooseReceiverFragmentDirections.actionChooseReceiverFragmentToSendCashFragment(receiverName,500)
            findNavController().navigate(action)
        }

    }


}