import React, { useState } from 'react';
import Display from './Display';

const Box = () => {
const [color, setColor] = useState('');
const [colorBox, setColorBox] = useState([]);

const addColor = (e) => {
    e.preventDefault();
    console.log(color);
    setColorBox([...colorBox, color]);
    setColor('');
};

return (
    <div>
    <form onSubmit={(e) => addColor(e)}>
        <div>
            <label>Color:</label>
            <input type="text" onChange={(e) => setColor(e.target.value)} value={color} />
        </div>
        <button>Add</button>
    </form>
    {colorBox.map((boxColor, idx) => (
        <div key={idx}>
            <Display color={boxColor} />
        </div>
    ))}
    </div>
);
};

export default Box;
