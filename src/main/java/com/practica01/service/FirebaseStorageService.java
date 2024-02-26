package com.practica01.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, long id);

    final String BucketName = "practica1grupal.appspot.com";

    final String rutaSuperiorStorage = "arbol";

    final String rutaJsonFile = "firebase";

    final String archivoJsonFile = "practica1grupal-firebase-adminsdk-oa97h-ebf6d9bed2.json";
}
