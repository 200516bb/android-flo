package com.example.flo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flo.databinding.FragmentSavedsongBinding

class SavedsongFragment : Fragment() {
    lateinit var binding: FragmentSavedsongBinding
    private var songDatas = ArrayList<Song>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSavedsongBinding.inflate(inflater, container, false)

        songDatas.apply {
            add(Song("Lilac", "아이유 (IU)", 0, 200, false, "music_lilac", R.drawable.img_album_exp2, false,))
            add(Song("Flu", "아이유 (IU)", 0, 200, false, "music_flu", R.drawable.img_album_exp2, false,))
            add(Song("Butter", "방탄소년단 (BTS)", 0, 190, false, "music_butter", R.drawable.img_album_exp, false,))
            add(Song("Next Level", "aespa", 0, 210, false, "music_next", R.drawable.img_album_exp3, false,))
            add(Song("Boy with Luv", "방탄소년단 (BTS)", 0, 230, false, "music_lilac", R.drawable.img_album_exp4, false,))
            add(Song("BBoom BBoom", "모모랜드", 0, 240, false, "music_bboom", R.drawable.img_album_exp5, false,))
        }

        val songRVAdapter = SongRVAdapter(songDatas)
        binding.lockerSavedSongRecyclerView.adapter = songRVAdapter
        binding.lockerSavedSongRecyclerView.layoutManager = LinearLayoutManager(context,
            LinearLayoutManager.VERTICAL, false)

        return binding.root
    }
}