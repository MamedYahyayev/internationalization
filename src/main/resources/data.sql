insert into internationalization.memory(built_in_memory , memory_type , ram , active)
values(512,'SSD',8 ,1);


insert into internationalization.processor(number_of_cores,processor_frequency , processor_type , active)
values(4, 1.8, 'Core i7' , 1);


insert into internationalization.screen(screen_resolution , screen_size , screen_type , video_cart_model , active)
values('FHD (1920x1080)',13,'IPS','Intel UHD Graphics' , 1);

insert into internationalization.notebook(brand_name , operation_system , description_eng , description_az , memory_id , 
						processor_id , screen_id , active)
values('HP','Windows 10',
'This product is one of our best-selling products. This notebook  is a favorite of buyers due to its  processors power, memory, screen size and many excellent features.',
'Bu məhsul ən çox satılan məhsullarımızdandır. Bu notebook prosessorun gücünə, yaddaşına, ekran ölçüsünə və çox əla xüsusiyyətlərinə görə alıcıların sevimlisidir.',1,1,1,1);