package desafio;

classe pública CalculaIdade {

	vazio estático  público principal (String[] args) {
		Pessoa pessoa = nova Pessoa(); 
		pessoa. idade = 15;
		pessoa. nome = "Peter";
		pessoa. sexo = "masculino";
		O sistema. para fora. println (pessoa. nomo);
		pessoa. maiorDeIdade(pessoa. idade);
		
		Pessoa pessoa2 = nova Pessoa();
		pessoa2. idade = 24;
		pessoa2. sexo = "feminino";
		pessoa2. nome = "Daniela";
		pessoa2. maiorDeIdade(pessoa2. idade);
	}

}
