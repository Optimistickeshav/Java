<?php
$name = $_POST['name'];
$email = $_POST['email'];
$subject = $_POST['subject'];
$message = $_POST['message'];

$to = "keshav.phenomenal@gmail.com";
mail($to, $subject, $message, "From:" . $name);
echo "Your Message has been Sent";
?>