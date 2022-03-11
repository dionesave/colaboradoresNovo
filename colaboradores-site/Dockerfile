FROM node:8.17.0

WORKDIR /app
COPY ["package.json", "package-lock.json","./"]
RUN npm install --production
RUN npm install @angular/cli@6.0.7
COPY . .
EXPOSE 4200
CMD ["npm", "start"]
