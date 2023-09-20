<?php
$arra = [1,0,1,2,3,54,32,1];
$b = [];
foreach ($arra as $key => $value) {
    if(!array_key_exists($value, $b)){
        $b[$value] = 1;
    }else {
        $b[$value]++;
    }
}
foreach ($b as $key => $value) {
    echo strval($key) . ' se repite ' . strval($value) .' veces<br>';
}
?>