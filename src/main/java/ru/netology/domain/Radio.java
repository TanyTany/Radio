package ru.netology.domain;

public class Radio {

        private int currentStation;
        int firstStation = 0;
        int lastStation = 9;


        private int currentVolume;
        int firstVolume = 0;
        int lastVolume = 10;


        public int changeNextStation(){
                currentStation +=1;
                if (currentStation > lastStation){
                        return firstStation;
                }
                return currentStation;
        }

        public int changePrevStation(){
                currentStation -= 1;
                if (currentStation < firstStation){
                        return lastStation;
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

        public int getCurrentVolume() {
                return currentVolume;
        }

        public void setCurrentVolume(int currentVolume) {

//                if (currentVolume > lastVolume){
//                        return;
//                }
//                if (currentVolume < firstVolume){
//                        return;
//                }

                this.currentVolume = currentVolume;
        }


}
