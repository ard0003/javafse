public interface EmployeeRepository extends JpaRepository<Employee, Integer> {}

@Autowired
private EmployeeRepository employeeRepository;

@Transactional
public void addEmployee(Employee employee) {
    employeeRepository.save(employee);
}
