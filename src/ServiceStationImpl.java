public class ServiceStationImpl implements ServiceStation {

    @Override
    public void check(MeansOfTransportation meansOfTransportation) {
        System.out.println("Обслуживаем " + meansOfTransportation.getModelName());
            for (int i = 0; i < meansOfTransportation.getWheelsCount(); i++) {
                meansOfTransportation.updateTyre();
            }
            if (meansOfTransportation instanceof Car){
                ((Car) meansOfTransportation).checkEngine();
            }
            if(meansOfTransportation instanceof Truck){
                ((Truck) meansOfTransportation).checkEngine();
                ((Truck) meansOfTransportation).checkTrailer();
            }
    }
}