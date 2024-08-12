<?php 
class Cliente{
    public function __construct()
    {
        try {
            $connection = new PDO("sqlsrv:Database=VendaVeiculos;server=localhost\SQLEXPRESS", "", "");
        } catch(PDOException $e) {
            echo 'Error: ' . $e->getMessage();
        }
    }
}

$conn = new Cliente();

?>
