import { styled } from "@mui/material";

export const ListStyled = styled("ul")`
  width: 100%;
  max-width: 800px;
  margin: 0 auto;
  padding: ${({ theme }) => theme.spacing(2)};
`;

export const ItenList = styled("li")`
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  gap: ${({ theme }) => theme.spacing(5)};
`;

export const Photo = styled("img")`
  width: 100%;
`;

export const Information = styled("div")``;

export const Name = styled("h2")``;

export const Description = styled("p")``;
