package kotlinproject.pkartadmin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinproject.pkartadmin.R
import kotlinproject.pkartadmin.databinding.FragmentProductBinding
import kotlinproject.pkartadmin.databinding.ItemCategoryLayoutBinding

class AddProductFragment : Fragment() {

    private lateinit var binding: FragmentProductBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProductBinding.inflate(layoutInflater)

        binding.floatingActionButton.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_productFragment_to_addProductFragment)

        }

        return binding.root
    }


}