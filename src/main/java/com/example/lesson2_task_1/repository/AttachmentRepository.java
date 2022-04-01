package com.example.lesson2_task_1.repository;

import com.example.lesson2_task_1.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "attachment")
public interface AttachmentRepository extends JpaRepository<Attachment, Long> {

    List<Attachment> findAllByAttachmentCollectionId(Long attachmentCollection_id);
}
