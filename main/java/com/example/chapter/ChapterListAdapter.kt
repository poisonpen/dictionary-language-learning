package com.example.chapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter.databinding.ListItemChapterBinding

class ChapterHolder (
    val binding: ListItemChapterBinding
        ):  RecyclerView.ViewHolder(binding.root) {
            fun bind(chapter: Chapter) {
                binding.chapterTitle.text = chapter.strangeText
                binding.date.text = chapter.lastUpdated.toString()
                binding.root.setOnClickListener { Toast.makeText(binding.root.context, "${chapter.strangeText} clicked!", Toast.LENGTH_SHORT).show() }
            }
        }

class ChapterListAdapter (
    private val chapters: List<Chapter>
): RecyclerView.Adapter<ChapterHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChapterHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemChapterBinding.inflate(inflater, parent, false)
        return ChapterHolder(binding)
    }

    override fun onBindViewHolder(holder: ChapterHolder, position: Int) {
        val chapter = chapters[position]
        holder.bind(chapter)
    }
    override fun getItemCount() = chapters.size
}