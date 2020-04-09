package com.codingwithmitch.cleannotes.notes.business.domain.repository

import com.codingwithmitch.cleannotes.notes.business.domain.model.Note


interface NoteRepository {

    suspend fun insertNewNote(title: String, body: String): Long

    suspend fun deleteNote(primaryKey: Int): Int

    suspend fun updateNote(primaryKey: Int, newTitle: String, newBody: String?): Int

    suspend fun searchNotes(
        query: String,
        filterAndOrder: String,
        page: Int
    ): List<Note>

    suspend fun getNumNotes(): Int
}