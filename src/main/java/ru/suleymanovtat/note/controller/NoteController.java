package ru.suleymanovtat.note.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.suleymanovtat.note.entity.Note;
import ru.suleymanovtat.note.service.NoteService;

import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/notes")
public class NoteController {

    private NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Note note) {
        return ResponseEntity.ok(noteService.save(note));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        Optional<Note> byId = noteService.findById(id);
        return Objects.isNull(byId)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(byId);

    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok(noteService.findAll());
    }
}
