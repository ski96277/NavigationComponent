package live.qtech.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        button_confirm.setOnClickListener {

            val userName=edit_text_user_name.text.toString();
            var password=edit_text_password.text.toString();

            Toast.makeText(context,userName,Toast.LENGTH_LONG).show();

            var action= LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(userName,password)
            findNavController().navigate(action)
        }

    }
}