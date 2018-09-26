package br.unicamp.ft.v148167_t177754.projeto;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class QuartoFragment extends Fragment {
    View view;

    public QuartoFragment() {

    }

    public void quartoFragment() {
        //spinner = view.findViewById(R.id.spinnerQuarto);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_quarto, container, false);
        }
        return view;
    }

}
