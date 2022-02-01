package com.jenergy.solar.navigationcomponent.dialog

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.jenergy.solar.navigationcomponent.R
import com.jenergy.solar.navigationcomponent.databinding.DialogConfirmReceiverBinding
import com.jenergy.solar.navigationcomponent.databinding.FragmentCashSendBinding
import com.jenergy.solar.navigationcomponent.databinding.FragmentReceiverChooseBinding


class confirmDialog : BottomSheetDialogFragment() {
    lateinit var binding: DialogConfirmReceiverBinding

    private val args:confirmDialogArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       // return inflater.inflate(R.layout.dialog_confirm_receiver, container, false)
        binding = DialogConfirmReceiverBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvEnterName.text = "Do you want to send ${args.amount} to ${args.receiverName}"

        binding.yesBtn.setOnClickListener {
            Toast.makeText(activity,"${args.amount} has been send to ${args.receiverName}",Toast.LENGTH_SHORT).show()
            dismiss()
        }
        binding.noBtn.setOnClickListener {
            dismiss()
        }
    }
}