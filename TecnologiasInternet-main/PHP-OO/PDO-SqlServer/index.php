<?php 
class Cliente{
    public $connection;
    public function __construct(){
        try {
            $this->connection = new PDO("sqlsrv:Database=VendaVeiculos;server=localhost\SQLEXPRESS", "", "");
        } catch(PDOException $e) {
            echo 'Error: ' . $e->getMessage();
        }
    }

    public function listAll(){
        $statement = $this->connection->prepare('SELECT * FROM clientes');
        $statement->execute();

        $users = $statement->fetchALL(PDO::FETCH_ASSOC);
        return $users;
    }

    public function listOne($IDCliente){
        $statement = $this->connection->prepare('SELECT * FROM clientes where IDCliente = :IDCliente');
        $statement->execute(array(":IDCliente" => $IDCliente)); 
        
        $users = $statement->fetchALL(PDO::FETCH_ASSOC);
        return $users;
    }

    public function addCliente($IDCliente, $NomeCliente, $Estado, $SiglaUF, $Cidade){
        $statement = $this->connection->prepare('
            INSERT INTO clientes (IDCliente, NomeCliente, Estado, SiglaUF, Cidade)
            VALUES (:IDCliente, :NomeCliente, :Estado, :SiglaUF, :Cidade)'
        );
        $statement->execute(
            array(
                ":IDCliente" => $IDCliente,
                ":NomeCliente" => $NomeCliente,
                ":Estado" => $Estado,
                ":SiglaUF" => $SiglaUF,
                ":Cidade" => $Cidade,
            )
        ); 
        
    }
}

$conn = new Cliente();
$users = $conn->listOne(219885441641235422);
//$users = $conn->listAll();
//$inserir = $conn->addCliente(219885441641235422, "Pedro HONDA", "Paraná", "PR", "Maringá");
echo "<pre>";
    print_r($users);
echo "</pre>";
?>
