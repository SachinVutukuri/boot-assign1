package com.stackroute.muzix.service;

import com.stackroute.muzix.domain.Track;

import java.util.List;

public interface TrackService {

    public Track saveTrack(Track track);

    public List<Track> getAllTracks();

    public void deleteTrack(int trackId);

    public Track updateComments(int trackId,String newComments);
}
