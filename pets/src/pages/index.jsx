// Components
import List from "../ui/components/List";
import Title from "../ui/components/Title";

const Home = () => {
  return (
    <div>
      <Title
        title=""
        subTitle={
          <span>
            Com um pequeno valor mensal, você <br />
            <strong>pode adotar um pet virtualmente</strong>
          </span>
        }
      />
      <List
        pets={[
          {
            id: 1,
            name: "bidu",
            history:
              "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Debitis culpa odit saepe eaque itaque similique, obcaecati sapiente nobis suscipit corrupti? Voluptatem laborum eum nesciunt rerum quibusdam quos eligendi enim doloremque?",
            photo: "#",
          },
          {
            id: 2,
            name: "Scooby",
            history:
              "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Debitis culpa odit saepe eaque itaque similique, obcaecati sapiente nobis suscipit corrupti? Voluptatem laborum eum nesciunt rerum quibusdam quos eligendi enim doloremque?",
            photo: "#",
          },
        ]}
      />
    </div>
  );
};

export default Home;
