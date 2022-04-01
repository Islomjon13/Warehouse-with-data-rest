package com.example.lesson2_task_1.repository;

import com.example.lesson2_task_1.entity.AttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachmentContent")
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Long> {
    AttachmentContent findByAttachmentId(Long attachment_id);
}
