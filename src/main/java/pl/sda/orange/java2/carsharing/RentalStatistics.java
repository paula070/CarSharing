//package pl.sda.orange.java2.carsharing;
//import pl.sda.orange.java2.carsharing.entity.Rental;
//
//import java.util.*;
//import java.util.stream.Collectors;
//public class RentalStatistics {
//
//
//        private List<Rental> rentals;
//
//        public RentalStatistics(List<Rental> rentals) {
//            this.rentals = rentals;
//        }
//
//        public double calculateTotalRevenue() {
//            return rentals.stream()
//                    .mapToDouble(Rental::getRentalCost)
//                    .sum();
//        }
//
//        public Map<String, Double> calculateRevenueByBranch() {
//            return rentals.stream()
//                    .collect(Collectors.groupingBy(r -> r.getCar().getBranch(), Collectors.summingDouble(Rental::getRentalCost)));
//        }
//
//        public Map<String, Double> calculateRevenueByCity() {
//            return rentals.stream()
//                    .collect(Collectors.groupingBy(r -> r.getCar().getCity(), Collectors.summingDouble(Rental::getRentalCost)));
//        }
//
//        public Map<String, Double> calculateRevenueByEmployee() {
//            return rentals.stream()
//                    .collect(Collectors.groupingBy(r -> r.getCar().getEmployee(), Collectors.summingDouble(Rental::getRentalCost)));
//        }
//
//        public Map<String, Long> calculateMostPopularRoutes() {
//            return rentals.stream()
//                    .collect(Collectors.groupingBy(r -> r.getCar().getPickupLocation() + " -> " + r.getCar().getReturnLocation(), Collectors.counting()));
//        }
//
//        public Map<String, Long> calculateMostPopularPickupLocations() {
//            return rentals.stream()
//                    .collect(Collectors.groupingBy(r -> r.getCar().getPickupLocation(), Collectors.counting()));
//        }
//
//        public Map<String, Long> calculateMostPopularReturnLocations() {
//            return rentals.stream()
//                    .collect(Collectors.groupingBy(r -> r.getCar().getReturnLocation(), Collectors.counting()));
//        }
//
//        public Map<String, Long> calculateMostPopularCars() {
//            return rentals.stream()
//                    .collect(Collectors.groupingBy(r -> r.getCar().getBrand() + " " + r.getCar().getModel(), Collectors.counting()));
//        }
//
//        public Map<String, Long> calculateCancelledReservationsByBranch() {
//            return rentals.stream()
//                    .filter(Rental::isCancelled)
//                    .collect(Collectors.groupingBy(r -> r.getCar().getBranch(), Collectors.counting()));
//        }
//
//        public Map<String, Long> calculateCancelledReservationsByEmployee() {
//            return rentals.stream()
//                    .filter(Rental::isCancelled)
//                    .collect(Collectors.groupingBy(r -> r.getCar().getEmployee(), Collectors.counting()));
//        }
//
//        public Map<String, Long> calculateCancelledReservationsByCar() {
//            return rentals.stream()
//                    .filter(Rental::isCancelled)
//                    .collect(Collectors.groupingBy(r -> r.getCar().getBrand() + " " + r.getCar().getModel(), Collectors.counting()));
//        }
//    }
//
