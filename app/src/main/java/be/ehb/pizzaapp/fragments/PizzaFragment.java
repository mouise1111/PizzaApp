package be.ehb.pizzaapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import be.ehb.pizzaapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PizzaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PizzaFragment extends Fragment {

    private ImageView mImageView;
//    private Button btnSizePizza;

    private View.OnClickListener mBtnSizeListener = view -> {
        SizeDialogFragment sdf = new SizeDialogFragment();
        sdf.show(getActivity().getSupportFragmentManager(), "sdf");
    };

    public PizzaFragment() {
        // Required empty public constructor
    }

//    public static PizzaFragment newInstance() {
//        PizzaFragment fragment = new PizzaFragment();
//        Bundle args = new Bundle();
//        fragment.setArguments(args);
//        return fragment;
//    }

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView = inflater.inflate(R.layout.fragment_pizza, container, false);

        mImageView.findViewById(R.id.imageView_pizza);

        Button btnSizePizza =  mView.findViewById(R.id.btn_size);
        btnSizePizza.setOnClickListener(mBtnSizeListener);

        return mView;
    }



}