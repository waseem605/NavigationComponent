package com.jenergy.solar.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.jenergy.solar.navigationcomponent.databinding.FragmentCashSendBinding
import com.jenergy.solar.navigationcomponent.databinding.FragmentHomeBinding
import kotlin.properties.Delegates


class SendCashFragment : Fragment() {
    lateinit var binding: FragmentCashSendBinding
    var receiverAmount:String = ""
    private val args:SendCashFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentCashSendBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()

        val receiverName = args.receiverName
        receiverAmount = args.amount.toString()
        binding.tv1.text = "Send cash to $receiverName"
        binding.etAmountName.setText(receiverAmount.toString())

        binding.viewSendBtn.setOnClickListener {
            receiverAmount = binding.etAmountName.text.trim().toString()
            val action = SendCashFragmentDirections.actionSendCashFragmentToConfirmDialog(receiverName,
                receiverAmount.toLong())
            navController.navigate(action)
        }

        binding.cancelBtn.setOnClickListener {
            findNavController().popBackStack(R.id.homeFragment,true)
        }
        binding.viewDoneBtn.setOnClickListener {
            val action = SendCashFragmentDirections.actionSendCashFragmentToHomeFragment()
            navController.navigate(action)
        }
    }

}