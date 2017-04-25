package com.nsxtreme.zm.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDateTime;

/**
 * Created by chris on 4/24/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {
    private int Id;
    private String name;
    private String cause;
    private LocalDateTime StartTime;
    private LocalDateTime EndTime;
    private int Width;
    private int Height;
    private float Length;
    private int Frames;
    private int AlarmFrames;
    private int TotScore;
    private int AvgScore;
    private int MaxScore;
    private int Archived;
    private int Videoed;
    private int Uploaded;
    private int Emailed;
    private int Messaged;
    private int Eecuted;
    private String Notes;
    private String BasePath;
    private int Next;
    private int Prev;
    private int NextOfMonitor;
    private int PrevOfMonitor;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public LocalDateTime getStartTime() {
        return StartTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        StartTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return EndTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        EndTime = endTime;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public float getLength() {
        return Length;
    }

    public void setLength(float length) {
        Length = length;
    }

    public int getFrames() {
        return Frames;
    }

    public void setFrames(int frames) {
        Frames = frames;
    }

    public int getAlarmFrames() {
        return AlarmFrames;
    }

    public void setAlarmFrames(int alarmFrames) {
        AlarmFrames = alarmFrames;
    }

    public int getTotScore() {
        return TotScore;
    }

    public void setTotScore(int totScore) {
        TotScore = totScore;
    }

    public int getAvgScore() {
        return AvgScore;
    }

    public void setAvgScore(int avgScore) {
        AvgScore = avgScore;
    }

    public int getMaxScore() {
        return MaxScore;
    }

    public void setMaxScore(int maxScore) {
        MaxScore = maxScore;
    }

    public int getArchived() {
        return Archived;
    }

    public void setArchived(int archived) {
        Archived = archived;
    }

    public int getVideoed() {
        return Videoed;
    }

    public void setVideoed(int videoed) {
        Videoed = videoed;
    }

    public int getUploaded() {
        return Uploaded;
    }

    public void setUploaded(int uploaded) {
        Uploaded = uploaded;
    }

    public int getEmailed() {
        return Emailed;
    }

    public void setEmailed(int emailed) {
        Emailed = emailed;
    }

    public int getMessaged() {
        return Messaged;
    }

    public void setMessaged(int messaged) {
        Messaged = messaged;
    }

    public int getEecuted() {
        return Eecuted;
    }

    public void setEecuted(int eecuted) {
        Eecuted = eecuted;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public String getBasePath() {
        return BasePath;
    }

    public void setBasePath(String basePath) {
        BasePath = basePath;
    }

    public int getNext() {
        return Next;
    }

    public void setNext(int next) {
        Next = next;
    }

    public int getPrev() {
        return Prev;
    }

    public void setPrev(int prev) {
        Prev = prev;
    }

    public int getNextOfMonitor() {
        return NextOfMonitor;
    }

    public void setNextOfMonitor(int nextOfMonitor) {
        NextOfMonitor = nextOfMonitor;
    }

    public int getPrevOfMonitor() {
        return PrevOfMonitor;
    }

    public void setPrevOfMonitor(int prevOfMonitor) {
        PrevOfMonitor = prevOfMonitor;
    }
}
