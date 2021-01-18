package ru.netology.domain;

public class Radio {

        private int currentStation;
        private int firstStation = 0;
        private int countStation;
        private int lastStation = countStation;

        private int currentVolume;
        int firstVolume = 0;
        int lastVolume = 100;

        public Radio(int countStation) {
                this.countStation = countStation;

        }

        public Radio() {
        }

        public int changeNextStation(){
                currentStation +=1;
                if (currentStation > countStation){
                        return firstStation;
                }
                return currentStation;

        }

        public int changePrevStation(){
                currentStation -= 1;
                if (currentStation < firstStation){
                        return countStation;
                }
                return currentStation;
        }





        public int changeNextVolume(){
                currentVolume +=1;
                if (currentVolume > lastVolume){
                        return lastVolume;
                }
                return currentVolume;
        }

        public int changePrevVolume(){
                currentVolume -=1;
                if (currentVolume < firstVolume){
                        return firstVolume;

                }
                return currentVolume;
        }

        public int getCurrentStation() {
                return currentStation;
        }

        public void setCurrentStation(int currentStation) {
                this.currentStation = currentStation;
        }

        public int getFirstStation() {
                return firstStation;
        }

        public void setFirstStation(int firstStation) {
                this.firstStation = firstStation;
        }

        public int getLastStation() {
                return lastStation;
        }

        public void setLastStation(int lastStation) {
                this.lastStation = lastStation;
        }

        public int getCountStation(int countStation) {

                return countStation;

        }

        public void setCountStation(int countStation) {
                this.countStation = countStation;
        }

        public int getCurrentVolume() {
                return currentVolume;
        }

        public void setCurrentVolume(int currentVolume) {
                this.currentVolume = currentVolume;
        }

        public int getFirstVolume() {
                return firstVolume;
        }

        public void setFirstVolume(int firstVolume) {
                this.firstVolume = firstVolume;
        }

        public int getLastVolume() {
                return lastVolume;
        }

        public void setLastVolume(int lastVolume) {
                this.lastVolume = lastVolume;
        }
}
