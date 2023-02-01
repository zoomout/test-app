// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.samples.model;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

import java.time.Instant;
import java.util.Objects;

@Container(containerName = "TodoItem")
public class TodoItem {
    @Id
    private String id;
    @PartitionKey
    private String description;
    private String owner;
    private Instant createdAt;
    private Instant updatedAt;
    private boolean finished;

    public TodoItem() {
    }

    public TodoItem(String id, String description, String owner, Instant updatedAt) {
        this.description = description;
        this.id = id;
        this.owner = owner;
        this.updatedAt = updatedAt;
        this.finished = false;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinish(boolean finished) {
        this.finished = finished;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return finished == todoItem.finished && Objects.equals(id, todoItem.id)
                && Objects.equals(description, todoItem.description) && Objects.equals(owner, todoItem.owner)
                && Objects.equals(createdAt, todoItem.createdAt) && Objects.equals(updatedAt, todoItem.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, id, owner, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", owner='" + owner + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", finished=" + finished +
                '}';
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

}

