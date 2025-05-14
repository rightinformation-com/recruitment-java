### Zadanie 3
Aplikacja ma zostać rozbudowana o mechanizm asynchronicznego logowania zmian urządzeń (np. dodanie nowego urządzenia) do osobnej kolejki zdarzeń.
Jest to potrzebne do integracji z innym systemem monitoringu.

1. Zdefiniuj prosty event DeviceCreatedEvent, który zawiera dane nowego urządzenia (np. serialNumber, model).
2. W momencie dodania urządzenia (POST /devices) opublikuj to zdarzenie. Możesz użyć ApplicationEventPublisher lub symulować RabbitMQ/Pulsara przez prosty @Async handler.
3. Zaimplementuj listener (@EventListener), który odbierze to zdarzenie i zapisze je do osobnej tabeli device_event_log w bazie.


