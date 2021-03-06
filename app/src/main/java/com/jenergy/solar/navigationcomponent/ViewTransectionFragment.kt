package com.jenergy.solar.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jenergy.solar.navigationcomponent.databinding.FragmentReceiverChooseBinding
import com.jenergy.solar.navigationcomponent.databinding.FragmentTrasectionViewBinding


class ViewTransectionFragment : Fragment() {

    lateinit var binding: FragmentTrasectionViewBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentTrasectionViewBinding.inflate(layoutInflater,container,false)

        // return inflater.inflate(R.layout.fragment_home, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textBtn.setOnClickListener {/*
            val  args = Bundle()
            args.putString("receiverName",receiverName)*/
            val action = ViewTransectionFragmentDirections.actionViewTransectionFragmentToSendCashFragment()
            findNavController().navigate(action)
        }

    }




}