package ru.suleymanovtat.note.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import ru.suleymanovtat.note.entity.Note;

@Repository
public interface NoteRepository extends CassandraRepository<Note, Long> {
}
