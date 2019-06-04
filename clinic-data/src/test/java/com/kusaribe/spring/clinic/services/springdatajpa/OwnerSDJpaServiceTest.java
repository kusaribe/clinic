package com.kusaribe.spring.clinic.services.springdatajpa;

import com.kusaribe.spring.clinic.model.Owner;
import com.kusaribe.spring.clinic.repository.OwnerRepository;
import com.kusaribe.spring.clinic.repository.PetRepository;
import com.kusaribe.spring.clinic.repository.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

@MockitoSettings(strictness = Strictness.LENIENT)
class OwnerSDJpaServiceTest {

    public static final String LAST_NAME = "Smith";
    Owner returnOwner;
    Owner o1;
    Owner o2;

    @Mock
    private  OwnerRepository ownerRepository;
    @Mock
    private  PetRepository petRepository;
    @Mock
    private  PetTypeRepository petTypeRepository;

    @Mock
    OwnerSDJpaService service;

    @BeforeEach
    void setUp() {

        returnOwner = new Owner();
        returnOwner.setId(1L);
        returnOwner.setLastName("Smith");

        returnOwner.builder().build();

    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);

        Owner smith = service.findByLastName(LAST_NAME);

        assertEquals(LAST_NAME, smith.getLastName());

        verify(ownerRepository).findByLastName(any());
    }

    @Test
    void findAll() {
        Set<Owner> returnOwnersSet = new HashSet<>();
        o1 = new Owner();
        o1.setLastName("smith");
        o1.setId(1L);
         o2 = new Owner();
        o2.setLastName("toome");
        o2.setId(2L);
        returnOwnersSet.add(o1);
        returnOwnersSet.add(o2);

        when(ownerRepository.findAll()).thenReturn(returnOwnersSet);

        Set<Owner> owners = service.findAll();

        assertNotNull(owners);
        assertEquals(2, returnOwnersSet.size());
    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));

        Owner owner = service.findById(1L);

        assertNotNull(owner);
    }

    @Test
    void findByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());

        Owner owner = service.findById(1L);

        assertNull(owner);
    }


    @Test
    void save() {
    }


    @Test
    void delete() {
        service.delete(returnOwner);

        //default is 1 times
        verify(ownerRepository, times(1)).delete(any());
    }

    @Test
    void deleteById() {
        service.deleteById(1L);

        verify(ownerRepository).deleteById(anyLong());
    }
}