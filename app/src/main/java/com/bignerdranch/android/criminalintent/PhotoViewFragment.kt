package com.bignerdranch.android.criminalintent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.DialogFragment
import java.io.File

private const val ARG_PHOTO_URI = "PhotoUri"

class PhotoViewFragment : DialogFragment() {

    private lateinit var photoView:ImageView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_picture_view, container, false)
        photoView = view.findViewById(R.id.crime_photo)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val photoPath = arguments?.getSerializable(ARG_PHOTO_URI) as String
        val bitmap = getScaledBitmap(photoPath, requireActivity())
        photoView.setImageBitmap(bitmap)
    }

    companion object {
        fun newIntent(photoUri: String): PhotoViewFragment {
            val args = Bundle().apply {
                putSerializable(ARG_PHOTO_URI, photoUri)
            }

            return PhotoViewFragment().apply {
                arguments = args
            }
        }
    }
}