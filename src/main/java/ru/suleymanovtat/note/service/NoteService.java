package ru.suleymanovtat.note.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.suleymanovtat.note.entity.Note;
import ru.suleymanovtat.note.repository.NoteRepository;

import java.util.*;

@Service
public class NoteService {

    private NoteRepository noteRepository;

    @Autowired
    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public Note save(Note note) {
        return noteRepository.save(note);
    }

    public Optional<Note> findById(Long id) {
        return noteRepository.findById(id);
    }

    public List<Note> findAll() {
        return noteRepository.findAll();
    }
}