package com.example.dictionaryletters
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import java.util.*

class DictionaryUnitFragment: Fragment() {
    private lateinit var dictionaryinst: DictionaryInst
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dictionaryinst = DictionaryInst(
            id = UUID.randomUUID(),
            strangeText = "",
            translationText = "",
            language = "",
            comment = ""
        )
    }

    override fun onCreateView(
        inflater:LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}