package com.example.lesson2_task_1.repository;

import com.example.lesson2_task_1.entity.AttachmentCollection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachmentCollection")
public interface AttachmentCollectionRepository extends JpaRepository<AttachmentCollection, Long> {
}
