import React from 'react';
import { View, Text, StyleSheet, Image, ScrollView } from 'react-native';
import rafaelImage from '../assets/images/perfil.png';
const SobreMimScreen = () => {
  return (
    <ScrollView contentContainerStyle={styles.container}>
      <View style={styles.profileSection}>
      <Image
            source={rafaelImage}
            style={styles.profileImage}
          />

        <Text style={styles.name}>Pedro Honda</Text>
        <Text style={styles.role}>Web Developper & Designer UX</Text>
      </View>

      <View style={styles.section}>
        <Text style={styles.title}>Sobre Honda</Text>
        <Text style={styles.description}>
        Saudações👋 me chamo Pedro de Carvalho Honda e sou estudante do último ano de "Análise e Desenvolvimento de Sistema" na Faculdade SENAC-Maringá.

Minhas áreas de maior domínio são Desenvolvimento Web Front-End, Programação Orientada a Objetos e Design UX/UI. Além disso, possuo grande familiariadade com softwares de design como Photoshop, Adobe Premiere, Blender e Figma.
        </Text>
      </View>

      <View style={styles.section}>
        <Text style={styles.subTitle}>Objetivo</Text>
        <Text style={styles.text}>
        Minha principal preocupação é trazer não só seriedade e confiabilidade, mas principalmente personalidade à sua marca, destacando-a em meio a tantas. Sempre levo comigo o pensamento "Se for pra fazer algo, faça bem feito"
        </Text>
      </View>
    </ScrollView>
  );
};

const styles = StyleSheet.create({
  container: {
    flexGrow: 1,
    padding: 20,
    backgroundColor: 'black',
  },
  profileSection: {
    alignItems: 'center',
    marginBottom: 30,
  },
  profileImage: {
    width: 120,
    height: 120,
    borderRadius: 60,
    marginBottom: 16,
  },
  name: {
    fontSize: 26,
    fontWeight: 'bold',
    color: 'white',
  },
  role: {
    fontSize: 16,
    color: '#666',
    marginTop: 4,
  },
  section: {
    marginBottom: 32,
  },
  title: {
    fontSize: 24,
    fontWeight: 'bold',
    color: '#fa4646',
    marginBottom: 8,
  },
  subTitle: {
    fontSize: 20,
    fontWeight: 'bold',
    color: '#fa4646',
    marginTop: 16,
    marginBottom: 8,
  },
  text: {
    fontSize: 16,
    color: '#f3f3f3',
    lineHeight: 24,
  },
  description: {
    fontSize: 16,
    color: '#f3f3f3',
    lineHeight: 24,
  },
});

export default SobreMimScreen;
