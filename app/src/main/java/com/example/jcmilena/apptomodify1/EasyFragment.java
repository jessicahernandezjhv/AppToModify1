package com.example.jcmilena.apptomodify1;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class EasyFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String numberArgument = "numero";
    private static final String colorArgument = "color";

    // TODO: Rename and change types of parameters
    private String firstNumber ="1";
    private int firstColor = R.color.colorBlanco;
    FragmentListener myListener;

    public EasyFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static EasyFragment newInstance(String number, int color) {
        EasyFragment fragment = new EasyFragment();
        Bundle myArguments = new Bundle();
        myArguments.putString(numberArgument, number);
        myArguments.putInt(colorArgument, color);
        fragment.setArguments(myArguments);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            firstNumber = getArguments().getString(numberArgument);
            firstColor = getArguments().getInt(colorArgument);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_easy, container, false);
        TextView textView = (TextView) view.findViewById(R.id.text_fragment);

        textView.setText("Soy el fragment "+ firstNumber);
        textView.setBackgroundResource(firstColor);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myListener.pulsado(firstNumber);
                }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        myListener = (FragmentListener)getActivity();
    }

    @Override public void onDetach() {
        super.onDetach();
    }

    public interface FragmentListener {
        public void pulsado (String numero);
    }


}
