import { Button } from "@mui/material";
// Components styles
import {
  Description,
  Information,
  ItenList,
  ListStyled,
  Name,
  Photo,
} from "./style";
// Service quebra de texto
import { TextService } from "../../../data/services/TextService";

export default function List(props) {
  // Tamanho do texto
  const sizeMaxText = 200;

  return (
    <ListStyled>
      {props.pets.map((pet) => (
        <ItenList key={pet.id}>
          <Photo src={pet.photo} alt={pet.name} />
          <Information>
            <Name>{pet.name}</Name>
            <Description>
              {TextService.LimitText(pet.history, sizeMaxText)}
            </Description>
            <Button variant={"contained"} fullWidth>
              Adotar {pet.name}
            </Button>
          </Information>
        </ItenList>
      ))}
    </ListStyled>
  );
}
