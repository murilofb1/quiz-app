package com.example.perguntaserespostas

class PointsUtil {
    companion object {
        private var lastPoints = 0
        private var roundPoints = 0

        fun updateLastPoints() {
            lastPoints = roundPoints
            roundPoints = 0
        }

        fun updateRoundPoints() {
            roundPoints++
        }

        fun getLastRoundPoints(): Int = lastPoints
    }
}