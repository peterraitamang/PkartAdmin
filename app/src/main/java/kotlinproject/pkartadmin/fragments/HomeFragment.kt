package kotlinproject.pkartadmin.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinproject.pkartadmin.R
import kotlinproject.pkartadmin.activity.AllOrderActivity
import kotlinproject.pkartadmin.databinding.ActivityAllOrderBinding
import kotlinproject.pkartadmin.databinding.FragmentHomeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.btnAddCategory.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_categoryFragment)
        }

        binding.btnAddProducts.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_productFragment)
        }

        binding.btnAddSlider.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_sliderFragment)
        }

        binding.btnAddOrderDetails.setOnClickListener {
            startActivity(Intent(requireContext(), AllOrderActivity::class.java))
        }

        return binding.root
    }


}