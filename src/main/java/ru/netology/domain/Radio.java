package ru.netology.domain;

public class Radio {

        private int currentStation;
        private int volume;


        public int changeStation(){

                currentStation +=1;
                return currentStation;
        }

        public int getCurrentStation() {
                return currentStation;
        }

        public void setCurrentStation(int currentStation) {

                this.currentStation = currentStation;
        }

        public int getVolume() {
                return volume;
        }

        public void setVolume(int volume) {
                this.volume = volume;
        }


}
