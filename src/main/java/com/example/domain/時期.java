package com.example.domain;

public enum 時期 {
    再繁忙期 {

        @Override
        public 大人一人あたり宿泊料金 calculaterForOneParson(収容人数 capacity) {
            return null;
        }

        @Override
        public 大人一人あたり宿泊料金 calculaterForTwoParson(収容人数 capacity) {
            return new 大人一人あたり宿泊料金(21600);
        }

        @Override
        public 大人一人あたり宿泊料金 calculaterForThreeParson(収容人数 capacity) {
            return new 大人一人あたり宿泊料金(20520);
        }

        @Override
        public 大人一人あたり宿泊料金 calculaterForFourParson(収容人数 capacity) {
            return new 大人一人あたり宿泊料金(19440);
        }
    },
    繁忙期 {

        @Override
        public 大人一人あたり宿泊料金 calculaterForOneParson(収容人数 capacity) {
            return null;
        }

        @Override
        public 大人一人あたり宿泊料金 calculaterForTwoParson(収容人数 capacity) {
            return new 大人一人あたり宿泊料金(20520);
        }

        @Override
        public 大人一人あたり宿泊料金 calculaterForThreeParson(収容人数 capacity) {
            return new 大人一人あたり宿泊料金(18360);
        }

        @Override
        public 大人一人あたり宿泊料金 calculaterForFourParson(収容人数 capacity) {
            return new 大人一人あたり宿泊料金(17280);
        }
    },
    通常期 {

        @Override
        public 大人一人あたり宿泊料金 calculaterForOneParson(収容人数 capacity) {
            return null;
        }

        @Override
        public 大人一人あたり宿泊料金 calculaterForTwoParson(収容人数 capacity) {
            return new 大人一人あたり宿泊料金(17280);
        }

        @Override
        public 大人一人あたり宿泊料金 calculaterForThreeParson(収容人数 capacity) {
            return new 大人一人あたり宿泊料金(15120);
        }

        @Override
        public 大人一人あたり宿泊料金 calculaterForFourParson(収容人数 capacity) {
            return new 大人一人あたり宿泊料金(14040);
        }
    },
    閑散期 {

        @Override
        public 大人一人あたり宿泊料金 calculaterForOneParson(収容人数 capacity) {
            return null;
        }

        @Override
        public 大人一人あたり宿泊料金 calculaterForTwoParson(収容人数 capacity) {
            return new 大人一人あたり宿泊料金(12960);
        }

        @Override
        public 大人一人あたり宿泊料金 calculaterForThreeParson(収容人数 capacity) {
            return new 大人一人あたり宿泊料金(12960);
        }

        @Override
        public 大人一人あたり宿泊料金 calculaterForFourParson(収容人数 capacity) {
            return new 大人一人あたり宿泊料金(12960);
        }
    },
    最閑散期 {

        @Override
        public 大人一人あたり宿泊料金 calculaterForOneParson(収容人数 capacity) {
            return null;
        }

        @Override
        public 大人一人あたり宿泊料金 calculaterForTwoParson(収容人数 capacity) {
            return new 大人一人あたり宿泊料金(11880);
        }

        @Override
        public 大人一人あたり宿泊料金 calculaterForThreeParson(収容人数 capacity) {
            return new 大人一人あたり宿泊料金(11880);
        }

        @Override
        public 大人一人あたり宿泊料金 calculaterForFourParson(収容人数 capacity) {
            return new 大人一人あたり宿泊料金(11880);
        }
    };

    public 大人一人あたり宿泊料金 calculater(収容人数 capacity) {

        大人一人あたり宿泊料金 priceForAdult = capacity.calculater(this);
        return priceForAdult;
    }

    public abstract 大人一人あたり宿泊料金 calculaterForOneParson(収容人数 capacity);
    public abstract 大人一人あたり宿泊料金 calculaterForTwoParson(収容人数 capacity);
    public abstract 大人一人あたり宿泊料金 calculaterForThreeParson(収容人数 capacity);
    public abstract 大人一人あたり宿泊料金 calculaterForFourParson(収容人数 capacity);
}
