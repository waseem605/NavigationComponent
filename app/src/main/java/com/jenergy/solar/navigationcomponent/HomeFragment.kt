package com.jenergy.solar.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jenergy.solar.navigationcomponent.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment


        binding = FragmentHomeBinding.inflate(layoutInflater,container,false)


       // return inflater.inflate(R.layout.fragment_home, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()
        binding.sendMoneyBtn.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_chooseReceiverFragment)
        }
        binding.viewBalanceBtn.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToViewBalanceFragment()
            navController.navigate(action)
        }
        binding.viewTransitionBtn.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToViewTransectionFragment()
            navController.navigate(action)
        }
    }

}