package com.uam_control_system.model;

import lombok.Data;

@Data
public class Coordinate {
    private String instanceId; // 드론 인스턴스 ID
    private double latitude; // 위도
    private double longitude; // 경도
    private double altitude; // 고도
    private double speed;
    private String status;
}